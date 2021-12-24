require './app/mission_c_097.rb'

describe '当選チェック' do
  describe '出力結果のテスト' do
    let(:missionC097) { MissionC097.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "5 2 4\n"
      expect { missionC097.run }.to output("N\nA\nN\nAB\nN\n").to_stdout
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "6 3 2\n"
      expect { missionC097.run }.to output("N\nB\nA\nB\nN\nAB\n").to_stdout
    end
  end
end
