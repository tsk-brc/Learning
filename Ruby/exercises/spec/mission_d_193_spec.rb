require './app/mission_d_193.rb'

describe '電池交換チェック' do
  describe '出力結果のテスト' do
    let(:missionD193) { MissionD193.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "3\n", "10\n"
      expect { missionD193.run }.to output("3\n1\n").to_stdout
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "1\n", "1\n"
      expect { missionD193.run }.to output("1\n0\n").to_stdout
    end
  end
end
