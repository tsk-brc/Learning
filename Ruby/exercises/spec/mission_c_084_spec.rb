require './app/mission_c_084.rb'

describe '装飾文字列のチェック' do
  describe '出力結果のテスト' do
    let(:missionC084) { MissionC084.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets) { "Test\n" }
      expect { missionC084.run }.to output("++++++\n+Test+\n++++++\n").to_stdout
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets) { "TicTacToe\n" }
      expect { missionC084.run }.to output("+++++++++++\n+TicTacToe+\n+++++++++++\n").to_stdout
    end
  end
end
