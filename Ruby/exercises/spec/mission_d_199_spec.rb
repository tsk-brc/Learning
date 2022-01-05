require './app/mission_d_199.rb'

describe '餅算出チェック' do
  describe '出力結果のテスト' do
    let(:missionD199) { MissionD199.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "2\n", "7\n"
      expect { missionD199.run }.to output("14\n").to_stdout
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "1\n", "1\n"
      expect { missionD199.run }.to output("1\n").to_stdout
    end
  end
end
